// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>Student Database</title>
// </head>
// <body>
//     <h1>Student Database</h1>

//     <div>
//         <input id="name" placeholder="Name"> 
//         <input id="age" placeholder="Age" type="number"> 
//         <input id="grade" placeholder="Grade">
//         <button onclick="add()">Add</button>
//     </div>

    
//     <div>
//         <input id="id" placeholder="ID to Update" type="number"> 
//         <input id="new-name" placeholder="New Name"> 
//         <input id="new-age" placeholder="New Age" type="number"> 
//         <input id="new-grade" placeholder="New Grade">
//         <button onclick="update()">Update</button>
//     </div>

//     <div>
//         <input id="remove-id" placeholder="ID to Remove" type="number">
//         <button onclick="remove()">Remove</button>
//     </div>

    
//     <div>
//         <button onclick="show()">Show All</button>
//         <div id="list"></div>
//     </div>

//     <script>
//         let students = [];
//         let nextId = 1; 

//         function add() {
//             const name = document.getElementById('name').value.trim();
//             const age = document.getElementById('age').value.trim();
//             const grade = document.getElementById('grade').value.trim();
//             if (name && age && grade) {
//                 students.push({ id: nextId++, name, age, grade });
//                 alert("Student Added!");
//                 show(); 
//             } else {
//                 alert("Please fill all fields.");
//             }
//         }

//         function update() {
//             const id = parseInt(document.getElementById('id').value);
//             const newName = document.getElementById('new-name').value.trim();
//             const newAge = document.getElementById('new-age').value.trim();
//             const newGrade = document.getElementById('new-grade').value.trim();

//             const student = students.find(s => s.id === id);
//             if (student) {
//                 if (newName) student.name = newName;
//                 if (newAge) student.age = newAge;
//                 if (newGrade) student.grade = newGrade;
//                 alert("Student Updated!");
//                 show();
//             } else {
//                 alert("Student not found.");
//             }
//         }

//         function remove() {
//             const id = parseInt(document.getElementById('remove-id').value);
//             const initialLength = students.length;
//             students = students.filter(s => s.id !== id);
//             if (students.length < initialLength) {
//                 alert("Student Removed!");
//                 show(); 
//             } else {
//                 alert("Student not found.");
//             }
//         }

//         function show() {
//             const list = document.getElementById('list');
//             list.innerHTML = students.length
//                 ? students.map(s => `<p>ID: ${s.id}, Name: ${s.name}, Age: ${s.age}, Grade: ${s.grade}</p>`).join('')
//                 : "No Students!";
//         }
//     </script>
// </body>
// </html>
