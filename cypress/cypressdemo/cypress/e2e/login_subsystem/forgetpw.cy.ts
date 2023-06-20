describe('the login test', () => {
    beforeEach(() => {
        cy.visit('1.117.227.19:80');
        cy.url().should('include', '/login');
        cy.viewport(2000, 1000);
        cy.get("a").filter(':visible').click();
    })

    //中途退出界面
    it("interrupt midway", () => {
        cy.url().should('include', '/login');
        cy.get('button').eq(0).click();
        cy.get('input[placeholder="Password"').clear().type('123456');
        cy.get('button').eq(2).click();
    })

    //邮箱为空
    it("null mail", () => {
        cy.url().should('include', '/login');
        cy.get('button').eq(0).click();
        cy.get('input[placeholder="激活码"').clear().type('??????');
        cy.get('input[placeholder="Password"').clear().type('123456');
        cy.get('input[placeholder="Re-enter Password"').clear().type('123456');
        cy.get('button').eq(1).click();
        cy.get('div[role="alert"]').should('have.text', '邮箱不能为空！');
    })

    //验证码错误
    it("wrong code", () => {
        cy.url().should('include', '/login');
        cy.get('button').eq(0).click();
        cy.get('input[placeholder="Mail"').type('wrong@tongji.edu.cn');
        cy.get('input[placeholder="激活码"').clear().type('??????');
        cy.get('input[placeholder="Password"').clear().type('123456');
        cy.get('input[placeholder="Re-enter Password"').clear().type('123456');
        cy.get('button').eq(1).click();
        cy.get('div[role="alert"]').should('have.text', '验证码错误！');
    })

    //下面这两个在自动化测试框架下不是很容易测，需要人工输入一下验证码
    // //两次输入的密码不一致
    // it("different pw",()=>{
    //     cy.url().should('include', '/login');
    // })

    // //邮箱没有注册过[text:该邮箱未注册，请先注册]
    // it("not registered mail", () => {
    //     cy.url().should('include', '/login');
    //     cy.get('input[placeholder="Mail"').type('wrong@tongji.edu.cn');

    // })

})