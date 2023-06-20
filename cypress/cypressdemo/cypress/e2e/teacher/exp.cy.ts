describe("experiment function test", () => {
    //前提是已经成功登录
    before(() => {
        cy.visit('1.117.227.19:80');
        cy.url().should('include', '/login');
        cy.viewport(2000, 1000);
        cy.get('input').eq(0).clear().should('have.value', '').type('7', { force: true });
        cy.get('input').eq(1).clear().should('have.value', '').type('123456', { force: true });
        //cy.get('input').eq(2).clear().should('have.value', '').type('amrz', { force: true });
        cy.get('#mx_n_1599620107948').click();
        cy.url().should('include', 'gradeset');
    })

    it("exp item management", () => {
        cy.get("div[class='el-submenu__title']").filter(':visible').eq(1).click();
        cy.get("li[role='menuitem']").filter(':visible').eq(2).click();
    })


})