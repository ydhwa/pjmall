show tables;
select * from webdb.oauth_client_details;

INSERT
INTO webdb.oauth_client_details (CLIENT_ID, RESOURCE_IDS, CLIENT_SECRET, SCOPE, AUTHORIZED_GRANT_TYPES, WEB_SERVER_REDIRECT_URI, AUTHORITIES, ACCESS_TOKEN_VALIDITY, REFRESH_TOKEN_VALIDITY, ADDITIONAL_INFORMATION, AUTOAPPROVE)
VALUES ('pjmall', '', '1234', 'MALL_USER', 'password, authorization_code, refresh_token', '', '', null, null, '{}', '');
