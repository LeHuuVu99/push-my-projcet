$(document).ready(function () {

$("form").validate({
    rules: {
        Firstname: {
        required: true,
      },
      Lastname: {
        required: true,
      },
      phone: {
        required: true,


      },
      birthDay: {
        required: true,


      },
      gender: {
        required: true,


      },
      Account: {
        required: true,
      },
      Email: {
        required: true,
      },
      Password: {
        required: true,
      },
      Address: {
        required: true,
      },
      department: {
        required: true,
      },
      Remark: {
        required: true,
      },


    },
    messages: {
        Firstname: {
        required: "Vui lòng nhập vào giá trị",
      },
      Lastname: {
        required: "Vui lòng không để trống",
      },
      phone: {
        required: "Vui lòng không để trống",
      },
      birthDay: {
        required: "Vui lòng không để trống",
      },
      gender: {
        required: "Vui lòng không để trống",
      },
      Account: {
        required: "Vui lòng không để trống",
      },
      Email: {
        required: "Vui lòng không để trống",
      },
      Password: {
        required: "Vui lòng không để trống",
      },
      Address: {
        required: "Vui lòng không để trống",
      },
      department: {
        required: "Vui lòng không để trống",
      },
      Remark: {
        required: "Vui lòng không để trống",
      },
    },
  });
})