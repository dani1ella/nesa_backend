# 🎓 Student Reporting Management System (SRMS)

A robust, role-based platform for managing schools, academic progress, and generating student report cards. Designed to serve administrators, headteachers, teachers, and students with tailored access and features.

---

## 🚀 Project Objective

To create an intelligent and scalable web system that manages:
- 🏫 School records and teacher assignments (Admin role).
- 🧑‍🏫 Class structure and academic tracking (Headteacher role).
- 📝 Grade submissions and student progress (Teacher role).
- 📊 Real-time academic reports and report card generation (All roles).

---

## 🧠 Features Breakdown

### 1. 🛠️ School Management Module (Admin Role)
- Add and manage schools.
- Assign headteachers to schools.

### 2. 🏫 Headteacher Module
- Add teachers to a school.
- Create classes and assign students.
- Assign teachers to classes and courses.
- Add courses with maximum mark validation.

### 3. 🧑‍🏫 Teacher Module
- Secure login with assigned credentials.
- Submit:
  - End of Unit Marks
  - End of Term Marks

### 4. 🎓 Student Module
- Automatically assigned to classes and courses.
- View academic progress and report cards.

### 5. 📄 Report Card Generation (Headteacher)
- Export student report cards for any term after teacher submissions.

---

## 🗃️ Database Design Overview

- **Entities**:
  - `Schools`
  - `Headteachers`
  - `Teachers`
  - `Classes`
  - `Students`
  - `Courses`
  - `Marks`

- **Key Constraints**:
  - Courses have a maximum mark limit.
  - Teachers can only input marks for their assigned courses/classes.

---


## 🛠️ Tech Stack (Recommended)

| Layer          | Tool / Tech                |
|----------------|----------------------------|
| Frontend       | React      |
| Backend        | Node.js  |
| Database       | PostgreSQL          |
| Authentication| JWT    |
| Design         | Figma                      |
| Deployment     | Render / Vercel / Railway  |

---

## 📦 Installation (If you're building with Node/Express)

```bash
git clone https://github.com/your-username/srms.git
cd srms
npm install
npm run dev
