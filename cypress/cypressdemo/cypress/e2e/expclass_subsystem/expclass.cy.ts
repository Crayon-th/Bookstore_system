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

    //管理资料[查看详情]
    it("check class", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(3).click();
        cy.get("button:contains('查看详情')").eq(0).click();
        cy.url().should('include', 'experimentdetail');
        cy.get("span:contains('返回')").eq(0).click();
    })

    //班级人员管理【删除教师】
    it("delete teacher", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(4).click();
        cy.get("tbody").find('tr').eq(0).find('td').eq(4).get('button').contains("删除").click();
        cy.get('div[role="alert"]').should('have.text', '不可删除教师');
    })

    //班级人员管理【删除学生,中途退出】
    it("delete stu1", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(4).click();
        cy.get('button:contains("删除")').filter(":visible").eq(4).click(); //试图删除第三个同学
        cy.get('button:contains("取 消")').click();
    })

    //班级人员管理【删除学生】
    it("delete stu2", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(4).click();
        cy.get('button:contains("删除")').filter(":visible").eq(4).click();
        cy.get('button:contains("确 定")').click();
    })

    //班级人员管理【添加学生】
    it("add stu", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(4).click();
        cy.get("tbody").eq(1).find('tr').eq(0).click();
        cy.get("button:contains('加入人员')").click();
        cy.get("div[role='alert']").should('have.text', "加入人员成功");
    })

    //添加实验
    it("add exp", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(5).click();
        cy.get("tbody").find('tr').eq(1).click();
        cy.get("button:contains('加入实验报告')").click();
        cy.get("div[role='alert']").should('have.text', '加入实验报告成功');
    })

    //删除实验【中途退】
    it("del exp1", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(5).click();
        cy.get("button:contains('删除')").eq(1).click();
        cy.get('button:contains("取 消")').click();
    })

    //删除实验
    it("del exp2", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(2).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(5).click();
        cy.get("button:contains('删除')").eq(1).click();
        cy.get('button:contains("确 定")').click();
        cy.get("div[role='alert']").should('have.text', "删除实验报告成功");
    })
})