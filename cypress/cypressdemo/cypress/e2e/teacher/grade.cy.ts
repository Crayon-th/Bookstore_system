describe('main teacher test', () => {
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

    //修改成绩比重【考前次数输入非法】
    it("change grade weight[wrong time format]", () => {
        cy.url().should('include', 'gradeset');
        cy.get('tbody').find('tr').eq(0).find('td').eq(5).get('button').filter(":visible").eq(0).contains("修改成绩权重").click();
        cy.get('input[placeholder="请输入该班级的考勤次数"]').filter(":visible").clear().type('dd');
        cy.get('input[value="确定"]').filter(":visible").click();
        cy.get('div[role="alert"]').should('have.text', '接口调用失败！46');
    })

    //正常修改成绩比重
    it("change grade weight normal", () => {
        cy.url().should('include', 'gradeset');
        // cy.get('tbody').find('tr').eq(0).find('td').eq(1).filter(":visible").should('have.text', 10);
        // cy.get('tbody').find('tr').eq(0).find('td').eq(2).filter(":visible").should('have.text', 0.3);
        // cy.get('tbody').find('tr').eq(0).find('td').eq(3).filter(":visible").should('have.text', 1);
        // cy.get('tbody').find('tr').eq(0).find('td').eq(4).filter(":visible").should('have.text', 0.7);

        cy.get('tbody').find('tr').eq(0).find('td').eq(5).get('button').filter(":visible").eq(0).contains("修改成绩权重").click();
        cy.get('input[placeholder="请输入该班级的考勤次数"]').filter(":visible").clear().type('2');
        cy.get('input[placeholder="请输入该班级的考勤权重（0-1）"]').filter(':visible').clear().type("0.2");
        cy.get('input[placeholder="请输入该班级的实验权重（0-1）"]').filter(':visible').clear().type("0.8");
        cy.get('input[value="确定"]').filter(":visible").click();

        cy.get('tbody').find('tr').eq(0).find('td').eq(1).filter(":visible").should('have.text', 2);
        cy.get('tbody').find('tr').eq(0).find('td').eq(2).filter(":visible").should('have.text', 0.2);
        cy.get('tbody').find('tr').eq(0).find('td').eq(3).filter(":visible").should('have.text', 1);
        cy.get('tbody').find('tr').eq(0).find('td').eq(4).filter(":visible").should('have.text', 0.8);
    })

    it("calculate grade", () => {
        cy.url().should('include', 'gradeset');
        //const stub = cy.stub();
        //cy.on('window:alert', stub);
        cy.get('tbody').find('tr').eq(0).find('td').eq(5).get('button').filter(":visible").eq(1).contains("计算成绩").click();
        cy.url().should('include', 'gradeset');
    })
})
