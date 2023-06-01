Task-1 solution
        SELECT d.name AS department_name, AVG(e.salary) AS average_monthly_salary
        FROM department d
        JOIN employee e ON d.department_id = e.department_id
        GROUP BY d.department_id, d.name
        ORDER BY average_monthly_salary DESC
        LIMIT 3;

Task -2 Solution

import pandas as pd

        # Read the department data from the department worksheet CSV file
        department_data = pd.read_csv('department_worksheet.csv')

        # Read the employee data from the employee worksheet CSV file
        employee_data = pd.read_csv('employee_worksheet.csv')

        # Merge the department and employee data based on the department ID
        merged_data = pd.merge(department_data, employee_data, on='department_id')

        # Calculate the average monthly salary for each department
        average_salary = merged_data.groupby(['department_id', 'department_name'])['salary'].mean().reset_index()

        # Sort the departments based on average monthly salary in descending order
        sorted_departments = average_salary.sort_values('salary', ascending=False).head(3)

        # Print the report
        print("Top 3 Departments by Average Monthly Salary:")
        print("------------------------------------------")
        for index, row in sorted_departments.iterrows():
        print("Department Name:", row['department_name'])
        print("Average Monthly Salary:", row['salary'])
        print("------------------------------------------")

Task-3 Solution

        def compute_value(n):
        if n < 10:
        return n * n
        elif n >= 10 and n <= 20:
        factorial = 1
        for i in range(1, n - 10 + 1):
        factorial *= i
        return factorial
        else:
        return sum(range(1, n - 20 + 1))

        # Test the function with different inputs
        inputs = [4, 15, 25]
        for n in inputs:
        result = compute_value(n)
        print(f"For n = {n}, Result = {result}")
