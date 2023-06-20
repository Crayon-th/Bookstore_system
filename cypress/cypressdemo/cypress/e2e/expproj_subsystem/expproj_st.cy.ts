describe('main teacher test', () => {
    //前提是已经成功登录学生账号
    beforeEach(() => {
        cy.visit('1.117.227.19:80');
        cy.url().should('include', '/login');
        cy.viewport(2000, 1000);
        cy.get('input').eq(0).clear().should('have.value', '').type('s2@tongji.edu.cn', { force: true });
        cy.get('input').eq(1).clear().should('have.value', '').type('1234567', { force: true });
        //cy.get('input').eq(2).clear().should('have.value', '').type('amrz', { force: true });
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', 'gradedisplay');
    })

    //学生查看自己实验报告
    it("check report", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(3).click();
        cy.get("button:contains('查看详情')").eq(0).click();
        cy.url().should("include", "reportdetail");
    })

    //学生完成自己实验报告[实验现象字数不符合要求]
    it("finish report[illegal phenomemon number]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get("button:contains('完成报告')").eq(0).click();
        cy.url().should("include", "finishreport");
        cy.get("button:contains('提交实验报告')").click();
        cy.get("div[role='alert']").should("have.text", '请完善实验现象');
    })

    //学生完成自己实验报告[实验感悟字数不符合要求]
    it("finish report[illegal rethink number]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get("button:contains('完成报告')").eq(0).click();
        cy.url().should("include", "finishreport");
        cy.get('textarea[placeholder="请输入实验现象(小于900字)"]').clear().type("这里是实验现象");
        cy.get("button:contains('提交实验报告')").click();
        cy.get("div[role='alert']").should("have.text", '请完善实验感悟');
    })

    //学生完成自己实验报告[正常版本]
    it("finish report[success]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get("button:contains('完成报告')").eq(0).click();
        cy.url().should("include", "finishreport");
        cy.get('textarea[placeholder="请输入实验现象(小于900字)"]').clear().type("这里是实验现象");
        cy.get('textarea[placeholder="请回答问题与思考并记录实验的感悟(小于400字)"').clear().type("这里是实验心得");
        cy.get("button:contains('提交实验报告')").click();
        cy.get("div[role='alert']").should("have.text", '提交成功');
    })
})