package com.example.macaldo_exer4_slambook

// data class to hold values for the display of text and user input
class MyValues (
    // values for the labels which will not be changed
    var greeting: String = "Hello!",
    var nameLabel: String = "Name",
    var nicknameLabel: String = "Nickname",
    var ageLabel: String = "Age",
    var birthdayLabel: String = "When is your birthday?",
    var phoneNumberLabel: String = "Phone number",
    var emailLabel: String = "What is your email address?",
    var courseLabel: String = "What is your course?",
    var dreamLabel: String = "What is your ultimate dream?",
    var crushLabel: String = "Who is your secret crush?",
    var messageLabel: String = "What is your message for me?",
    var doneLabel: String = "DONE",
    var thankuLabel: String = "Thank you for answering!",
    // variables to hold the user input
    var name: String = "",
    var nickname: String = "",
    var age: String = "",
    var birthday: String = "",
    var phoneNumber: String = "",
    var email: String = "",
    var course: String = "",
    var dream: String = "",
    var crush: String = "",
    var message: String = ""
)