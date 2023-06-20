describe('administrator test', () => {
    //前提是已经成功登录管理员
    beforeEach(() => {
        cy.visit('1.117.227.19:80');
        cy.url().should('include', '/login');
        cy.viewport(2000, 1000);
        cy.get('input').eq(0).clear().should('have.value', '').type('907021907@qq.com', { force: true });
        cy.get('input').eq(1).clear().should('have.value', '').type('123456', { force: true });
        //cy.get('input').eq(2).clear().should('have.value', '').type('amrz', { force: true });
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', 'userlist');
    })

    it("authorization", () => {
        cy.url().should('include', 'userlist');
        cy.get('tbody').find('tr').eq(0).find('td').eq(5).find('button').filter(":visible").eq(0).contains("账号授权").click();
        cy.get('i[class="el-select__caret el-input__icon el-icon-arrow-up"').filter(':visible').click();
        cy.get('ul[class="el-scrollbar__view el-select-dropdown__list"').find("li").filter(':visible').eq(2).click();
        cy.get('button:contains("确 定")').filter(":visible").click();
        cy.get('tbody').find('tr').eq(0).find('td').eq(4).find('span').contains('教师').should('be.visible');
        //cy.get('button:contains("取 消")').click({ multiple: true, force: true });
    })

    it("authorization[halfway exit]", () => {
        cy.url().should('include', 'userlist');
        cy.get('tbody').find('tr').eq(0).find('td').eq(5).find('button').filter(":visible").eq(0).contains("账号授权").click();
        cy.get('i[class="el-select__caret el-input__icon el-icon-arrow-up"').filter(':visible').click();
        cy.get('ul[class="el-scrollbar__view el-select-dropdown__list"').find("li").filter(':visible').eq(2).click();
        cy.get('button:contains("取 消")').filter(":visible").click();
    })

    //最后再启动，会删掉一个用户
    // it("logout", () => {
    //     cy.url().should('include', 'userlist');
    //     const id = cy.get('tbody').find('tr').eq(0).find('td').eq(0).filter(':visible').invoke('text');
    //     cy.get('tbody').find('tr').eq(0).find('td').eq(5).find('button').filter(':visible').eq(1).contains("账号注销").click();
    //     cy.get('button:contains("确定")').filter(":visible").click();
    //     const id2 = cy.get('tbody').find('tr').eq(0).find('td').eq(0).filter(':visible').invoke('text');
    //     expect(id).to.not.equal(id2);
    // })

    it('logout[halfway exit]', () => {
        cy.url().should('include', 'userlist');
        cy.get('button:contains("账号注销")').filter(':visible').eq(0).click(); //随机获取第一个
        cy.get('button:contains("取消")').filter(":visible").click();
    })

    it("test", () => {
        cy.get('button:contains("账号注销")').filter(':visible').eq(0);
    })
})
