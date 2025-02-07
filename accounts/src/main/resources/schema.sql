CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile_number` varchar(20) NOT NULL,
  `created_at` date NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `updated_at` date DEFAULT NULL,
    `updated_by` varchar(20) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `accounts` (
  `customer_id` int NOT NULL,
   `account_number` int AUTO_INCREMENT  PRIMARY KEY,
  `account_type` varchar(100) NOT NULL,
  `branch_address` varchar(200) NOT NULL,
  `created_at` date NOT NULL,
   `created_by` varchar(20) NOT NULL,
   `updated_at` date DEFAULT NULL,
    `updated_by` varchar(20) DEFAULT NULL
);


-- Insert data into customer table
INSERT INTO `customer` (`name`, `email`, `mobile_number`, `created_at`, `created_by`, `updated_at`, `updated_by`)
VALUES
('John Doe', 'john.doe@example.com', '9876543210', '2025-02-06', 'admin', NULL, NULL),
('Alice Smith', 'alice.smith@example.com', '8765432109', '2025-02-06', 'admin', NULL, NULL),
('Bob Johnson', 'bob.johnson@example.com', '7654321098', '2025-02-06', 'admin', NULL, NULL),
('Emily Davis', 'emily.davis@example.com', '6543210987', '2025-02-06', 'admin', NULL, NULL),
('Michael Brown', 'michael.brown@example.com', '5432109876', '2025-02-06', 'admin', NULL, NULL);

-- Insert data into accounts table
INSERT INTO `accounts` (`customer_id`, `account_type`, `branch_address`, `created_at`, `created_by`, `updated_at`, `updated_by`)
VALUES
(1, 'Savings', '123 Main Street, New York, NY', '2025-02-06', 'admin', NULL, NULL),
(2, 'Checking', '456 Elm Street, Los Angeles, CA', '2025-02-06', 'admin', NULL, NULL),
(3, 'Savings', '789 Oak Street, Chicago, IL', '2025-02-06', 'admin', NULL, NULL),
(4, 'Business', '101 Pine Street, Houston, TX', '2025-02-06', 'admin', NULL, NULL),
(5, 'Checking', '202 Maple Street, Miami, FL', '2025-02-06', 'admin', NULL, NULL);