-- Initial database pre data
-- admin, password is honyee2013
insert into user_(id,guid,create_time,email,password,phone,username,default_user)
values
(21,'29f6004fb1b0466f9572b02bf2ac1be8',now(),'admin@honyee.cc','69f71fbb5b41bd481d5d3b28a02a0b7e','028-65536867','admin',true);


-- initial oauth client details test data
truncate  oauth_client_details;
insert into oauth_client_details
(client_id, resource_ids, client_secret, scope, authorized_grant_types,
web_server_redirect_uri,authorities, access_token_validity,
refresh_token_validity, additional_information, create_time, archived, trusted)
values
('unity-client','unity-resource', 'unity', 'read,write','password,authorization_code,refresh_token,implicit',
null,'ROLE_UNITY',null,
null,null, now(), 0, 0),
('mobile-client','mobile-resource', 'mobile', 'read,write','password,authorization_code,refresh_token,implicit',
null,'ROLE_MOBILE',null,
null,null, now(), 0, 0);