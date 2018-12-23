/**
 * Created by EVDOKIMOVAL on 30.08.2018.
 */

$(document).ready(function () {
    // $('#btnHello').click(function (e) {
    //     console.log('Hello');
    // });
    $('#btnHello').toggleClass("btn btn-primary")


    $('#btnHello').click(function (e) {
        $.post("/MySalary/salary_param", {
            name_param: 'Name: ' + $('#Name').val() + ', Last Name: ' + $('#LastName').val() + ', Salary: ' + $('#Salary').val()
        }).done(function (result) {
            location.reload();
        });
    });

    $('#btnHello').click(function (e) {
        $.post("/MySalary/salary_name", {
            fNameParam: $('#Name').val(), lNameParam: $('#LastName').val(), salParam: $('#Salary').val()
        })
    });
});