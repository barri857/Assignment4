CREATE TABLE agents (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL
);

CREATE TABLE properties (
    id SERIAL PRIMARY KEY,
    address VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    agent_id INT REFERENCES agents(id),
    type VARCHAR(50),
    feature_value DOUBLE PRECISION
);