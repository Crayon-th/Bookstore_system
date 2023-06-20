describe('main teacher test', () => {
    //前提是已经成功登录
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

    //班级人员管理【删除学生】
    // it("delete stu2", () => {
    //     cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
    //     cy.get("li[role='menuitem']").filter(':visible').eq(4).click();
    //     cy.get('button:contains("删除")').filter(":visible").eq(4).click();
    //     cy.get('button:contains("确 定")').click();
    // })

    //添加实验
    it("add exp", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(5).click();
        cy.get("tbody").find('tr').eq(2).click();
        cy.get("button:contains('加入实验报告')").click();
        cy.get("div[role='alert']").should('have.text', '加入实验报告成功');
    })


})