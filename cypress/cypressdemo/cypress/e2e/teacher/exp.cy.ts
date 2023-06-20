describe("experiment function test", () => {
    //前提是已经成功登录
    beforeEach(() => {
        cy.visit('1.117.227.19:80');
        cy.url().should('include', '/login');
        cy.viewport(2000, 1000);
        cy.get('input').eq(0).clear().should('have.value', '').type('7', { force: true });
        cy.get('input').eq(1).clear().should('have.value', '').type('123456', { force: true });
        //cy.get('input').eq(2).clear().should('have.value', '').type('amrz', { force: true });
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', 'gradeset');
    })

    //查看详情
    it("exp item management", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        //const name = cy.get('tbody').find('tr').eq(0).find('td').eq(1).invoke;
        cy.get('tbody').find('tr').eq(0).find('td').eq(2).get('button').eq(0).click();
        cy.url().should('include', 'experimentdetail');
        //返回上一级
        cy.get('span:contains("返回")').eq(0).click();
    })

    //删除实验
    it("delete exp", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get('tbody').find('tr').eq(10).find('td').eq(2).get('button').eq(1).click();
        cy.get('button:contains("确 定")').click();
        cy.get("div[role='alert']").should('have.text', '删除成功');
    })

    //新增实验项目[实验名称为空]
    it("add exp【1】", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get('button:contains("新增实验项目")').click();
        cy.get('button:contains("提交实验项目")').click();
        cy.get("div[role='alert']").should('have.text', '实验项目的名称不可为空');
    })

    //新增实验项目[实验目的为空]
    it("add exp[2]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get('button:contains("新增实验项目")').click();
        cy.get('input[placeholder="请输入实验名称"]').clear().type("name1");
        cy.get('button:contains("提交实验项目")').click();
        cy.get("div[role='alert']").should('have.text', '实验目的不可为空');
    })

    //新增实验项目[相关知识为空]
    it("add exp[3]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get('button:contains("新增实验项目")').click();
        cy.get('input[placeholder="请输入实验名称"]').clear().type("name1");
        cy.get('textarea[placeholder="请输入实验目的"]').clear().type("tar1");
        cy.get('button:contains("提交实验项目")').click();
        cy.get("div[role='alert']").should('have.text', '实验项目的相关知识不可为空');
    })

    //新增实验项目[实验步骤为空]
    it("add exp[4]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get('button:contains("新增实验项目")').click();
        cy.get('input[placeholder="请输入实验名称"]').clear().type("name1");
        cy.get('textarea[placeholder="请输入实验目的"]').clear().type("tar1");
        cy.get('textarea[placeholder="请输入实验的相关知识"]').clear().type("knowledge1");
        cy.get('button:contains("提交实验项目")').click();
        cy.get("div[role='alert']").should('have.text', '实验项目的步骤不可为空');
    })

    //新增实验项目[问题与思考为空]
    it("add exp[4]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get('button:contains("新增实验项目")').click();
        cy.get('input[placeholder="请输入实验名称"]').clear().type("name1");
        cy.get('textarea[placeholder="请输入实验目的"]').clear().type("tar1");
        cy.get('textarea[placeholder="请输入实验的相关知识"]').clear().type("knowledge1");
        cy.get('textarea[placeholder="请输入实验步骤"]').clear().type("step1");
        cy.get('button:contains("提交实验项目")').click();
        cy.get("div[role='alert']").should('have.text', '实验项目的问题与思考不可为空');
    })

    //新增实验项目[成功添加]
    it("add exp[4]", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
        cy.get('button:contains("新增实验项目")').click();
        cy.get('input[placeholder="请输入实验名称"]').clear().type("name1");
        cy.get('textarea[placeholder="请输入实验目的"]').clear().type("tar1");
        cy.get('textarea[placeholder="请输入实验的相关知识"]').clear().type("knowledge1");
        cy.get('textarea[placeholder="请输入实验步骤"]').clear().type("step1");
        cy.get('textarea[placeholder="请输入问题与思考"]').clear().type("pro1");
        cy.get('button:contains("提交实验项目")').click();
        cy.get("div[role='alert']").should('have.text', '提交成功');
        cy.get('span:contains("返回")').eq(0).click();
    })

})