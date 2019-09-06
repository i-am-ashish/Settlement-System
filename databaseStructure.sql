

-- 1.Stock Dividend
-- 2.Stock SPLIT
-- 3.Rights
-- 0.No action
--put constraint on the corporate_action in 1,2,3,0


--create a new database conection by the name of settlement_system and then create each table one by one sequentially

create table securities(
security_id integer ,
security_name varchar(30) not null,
default_market_price float,
corporate_action integer,
corporate_action_ratio integer,
constraint securities_pk primary key (security_id)
);

create table participants(
participant_id integer,
participant_name varchar(30) not null,
email_id varchar(50) not null unique,
contact_no varchar(10) not null unique,
constraint participant_pk primary key(participant_id)
);
create table login_info(
participant_id integer,
username integer not null unique,
password varchar(100) not null,
constraint login_info_pk primary key(participant_id),
constraint login_info_fk foreign key(participant_id) references participants(participant_id)
);
create table participant_balance(
participant_id integer not null,
security_id integer not null,  
security_quantity integer not null,
constraint participant_balance_fk1 foreign key(participant_id) references participants(participant_id),
constraint participant_balance_fk2 foreign key(security_id) references securities(security_id),
constraint participant_balance_pk primary key(security_id,participant_id)
);

create table transactions(
transaction_id integer,
SSIN_id integer not null,
seller_id integer not null,
buyer_id integer not null,
security_id integer not null,
security_quantity integer not null,
share_price float(4) not null,
constraint transaction_fk1 foreign key(buyer_id) references participants(participant_id),
constraint transaction_fk2 foreign key(seller_id) references participants(participant_id),
constraint transaction_fk3 foreign key(security_id) references securities(security_id),
constraint transaction_pk primary key(transaction_id)
);

create table netting_result(
participant_id integer not null,
security_id integer not null,   
amount float(4) not null,
constraint netting_pk primary key(participant_id,security_id),
constraint netting_fk1 foreign key(security_id) references securities(security_id),
constraint netting_fk2 foreign key(participant_id) references participants(participant_id)
);
