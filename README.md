# How to Run the Program

## Running the Program

### 1. Setting Up the Database Using Docker

#### Step 1: Create a `.env` File

Create a file named `.env` with the following variables:

```bash
DB_NAME=your_chosen_database_name
DB_PASSWORD=user_password
DB_ROOT_PASSWORD=root_user_password
DB_USER=your_username
```

#### Step 2: Run Docker Compose
Execute the following command at the project's root:
```bash
docker-compose up
```

#### Step 3: Set Up Environment Variables
Add the following environment variables to your IDE before running the project:
* DB_NAME=your_chosen_database_name
* DB_PASSWORD=user_password
* DB_ROOT_PASSWORD=root_user_password
* DB_USER=your_username
