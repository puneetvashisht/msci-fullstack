import { useState } from "react";

const ViewCourses = () => {

    const [courses, setCourses] = useState([
        // { id: 1, title: 'React Course 1', description: 'Learn React' },
        // { id: 2, title: 'React Course 2', description: 'Learn React' },
        // { id: 3, title: 'React Course 3', description: 'Learn React' },
      ])
    
      const coursesList = courses.map((course) => <tr>
      <th scope="row" key={course.id}>{course.id}</th>
      <td>{course.title}</td>
      <td>{course.price}</td>
      <td><button className="btn btn-danger" onClick={() => deleteCourse(course.id)}> X </button></td>
    </tr>)
    
      const loadCourses = () => {
        // Fetch courses from API or database
        console.log('button clicked');
        fetch('http://localhost:8081/courses', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        })
        .then((response) => response.json())
        .then((data) => setCourses(data))
      }
      const deleteCourse = (id) => {
        // Fetch courses from API or database
        console.log('delete courses clicked');
        fetch('http://localhost:8081/courses?id=' +id, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json',
            },
        })
        .then((response) =>{
            console.log(response);
            
        })
        // .then((data) => setCourses(data))
      }
      
    //   const deleteCourse = (id) => {

    return (
        <>
         <h2>View Courses Component</h2>
       
         <button onClick={loadCourses}>Load Courses</button>

         <table className="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">First</th>
                <th scope="col">Last</th>
                <th scope="col">Handle</th>
                </tr>
            </thead>
            <tbody>
            {coursesList}
            </tbody>
            </table>

        </>
       
    )
}

export default ViewCourses;