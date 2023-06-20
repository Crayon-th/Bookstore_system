describe('main teacher test', () => {
    //前提是已经成功登录教师账号
    beforeEach(() => {
        cy.visit('1.117.227.19:80');
        cy.url().should('include', '/login');
        cy.viewport(2000, 1000);
        cy.get('input').eq(0).clear().should('have.value', '').type('t@tongji.edu.cn', { force: true });
        cy.get('input').eq(1).clear().should('have.value', '').type('123456', { force: true });
        //cy.get('input').eq(2).clear().should('have.value', '').type('amrz', { force: true });
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', 'gradedisplay');
    })

    //教师批改实验报告栏目[非法评分]
    it("judge report[illegal number]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get("button:contains('批改报告')").eq(1).click(); //定位到第二行lyr的按钮处
        cy.url().should('include', 'correctreportdetail');
        cy.get('input[aria-label="描述文字"]').clear().type("1.1");
        cy.get("textarea").type("very good");
        cy.get("button:contains('提交批改')").click();
        cy.get("div[role='alert']").should("have.text", '提交批改失败');
    })

    //教师批改实验报告栏目
    it("judge report", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get("button:contains('批改报告')").eq(1).click();
        cy.url().should('include', 'correctreportdetail');
        cy.get('input[aria-label="描述文字"]').clear().type("5");
        cy.get("textarea").type("very good");
        cy.get("button:contains('提交批改')").click();
        cy.get("div[role='alert']").should("have.text", '提交批改成功')
    })
})