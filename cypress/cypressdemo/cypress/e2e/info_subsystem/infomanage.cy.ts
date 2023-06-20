// describe('main teacher test', () => {
//     //前提是已经成功登录
//     beforeEach(() => {
//         cy.visit('1.117.227.19:80');
//         cy.url().should('include', '/login');
//         cy.viewport(2000, 1000);
//         cy.get('input').eq(0).clear().should('have.value', '').type('7', { force: true });
//         cy.get('input').eq(1).clear().should('have.value', '').type('123456', { force: true });
//         //cy.get('input').eq(2).clear().should('have.value', '').type('amrz', { force: true });
//         cy.get('#mx_n_1599620107948').click();
//         cy.url().should('include', 'gradeset');
//     })

//     //管理资料
//     it("manage info", () => {
//         cy.get("div[class='el-submenu__title']").filter(':visible').eq(3).click();
//         cy.get("li[role='menuitem']").filter(':visible').eq(5).click();
//         cy.get("button:contains('管理相应资料')").eq(0).click();
//         cy.get('input[placeholder="请选择要移动到的位置"').click();
//         cy.find('ul[class="el-scrollbar__view el-select-dropdown__list"]').find('li').eq(1);
//     })
// })
