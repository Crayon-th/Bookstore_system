describe("test", () => {
    it("test", () => {
        cy.visit("http://testingpai.com/");
        cy.get("#navLogin").click();
        cy.url().should('include', 'login');
    })
})