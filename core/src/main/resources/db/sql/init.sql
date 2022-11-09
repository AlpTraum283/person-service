create table if not exists contact
(
    id           bigserial    not null primary key unique,
    phone_number varchar(255) not null,
    email        varchar(128) not null,
    profile_link text         not null
);

create table if not exists medical_card
(
    id            bigserial not null primary key unique,
    client_status char      not null,
    med_status    char      not null,
    registry_dt   date      not null,
    comment       text      not null
);

create table if not exists illness
(
    id              bigserial not null primary key unique,
    medical_card_id bigint    not null references medical_card (id),
    type_id         bigint    not null,
    heaviness       char      not null,
    appearance_dttm timestamp not null,
    recovery_dt     date      not null
);

create table if not exists person_data
(
    id              bigserial    not null primary key unique,
    last_name       varchar(255) not null,
    first_name      varchar(255) not null,
    birth_dt        date         not null,
    age             smallint     not null,
    sex             char         not null,
    contact_id      bigint       not null references contact (id),
    medical_card_id bigint       not null references medical_card (id),
    parent_id       bigint check ( parent_id <> id ) references person_data (id)
);

create table if not exists address
(
    id         bigserial    not null primary key unique,
    contact_id bigint       not null references contact (id),
    country_id bigint       not null,
    city       varchar(255) not null,
    index      integer      not null,
    street     varchar(255) not null,
    building   varchar(32)  not null,
    flat       varchar(32)  not null
);

create table if not exists users
(
    id       bigserial    not null primary key unique,
    login    varchar(255) not null,
    password varchar(255) not null,
    role     varchar(255) not null

);

create table if not exists signals
(
    id             bigserial    not null primary key unique,
    person_data_id bigint       not null references person_data (id),
    description    varchar(255) not null,
    type           varchar(255) not null

);

