describe('the login test', () => {
    beforeEach(() => {
        cy.visit('1.117.227.19:80');
        cy.url().should('include', '/login');
        cy.viewport(2000, 1000);
    })

    it("null mail", () => {
        cy.url().should('include', '/login');
        cy.get('input[placeholder="邮箱"').filter(":visible").clear();
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', '/login');
        cy.get('div[role="alert"]').should("have.text", "用户名或密码错误！")
    })

    it("null pw", () => {
        cy.url().should('include', '/login');
        cy.get('input[placeholder="邮箱"').filter(":visible").clear().type("907021907@qq.com");
        cy.get('input[placeholder="密码"').filter(":visible").clear();
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', '/login');
        cy.get('div[role="alert"]').should("have.text", "用户名或密码错误！")
    })

    it("wrong pw", () => {
        cy.url().should('include', '/login');
        cy.get('input[placeholder="邮箱"').filter(":visible").clear().type("907021907@qq.com");
        cy.get('input[placeholder="密码"').filter(":visible").clear().type('xxx');
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', '/login');
        cy.get('div[role="alert"]').should("have.text", "用户名或密码错误！")
    })


    it("login successfully", () => {
        cy.get('input').eq(0).clear().should('have.value', '').type('907021907@qq.com', { force: true });
        cy.get('input').eq(1).clear().should('have.value', '').type('123456', { force: true });
        //cy.get('input').eq(2).clear().should('have.value', '').type('amrz', { force: true });
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', 'userlist');
    })

})