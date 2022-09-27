const ls = JSON.parse(sessionStorage.getItem('paperId'))
const student = JSON.parse(sessionStorage.getItem('student'))

let noOfQuestions
let paperSubject
let paperId
let studentId

if (ls !== null) {

    noOfQuestions = ls['totalQuestions']
    paperSubject = ls['paperSubject']
    paperId = ls['paperId']
}

if(student !== null){
    studentId = student['studentId']
}

export { noOfQuestions, paperSubject , paperId , studentId }
