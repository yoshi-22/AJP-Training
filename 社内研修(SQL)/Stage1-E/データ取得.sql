# (1)営業所CDが’3001’のレコードを取得する
SELECT * 
FROM T_USER
WHERE  OFFICE_CD = "3001";

# (2)生年月日が2000年以降のユーザIDとユーザ名を取得
SELECT USER_ID AS "ユーザID",USER_NM AS "ユーザ名"
FROM T_USER
WHERE BIRTHDAY >= "2000/01/01";

# (3)ユーザ名に’田’がつくレコード数を取得する
SELECT COUNT(USER_NM) AS "ユーザ名に田を含むレコード数"
FROM T_USER
WHERE USER_NM LIKE "%田%";

# (4)生年月日の降順で並べ替えたレコードを取得する
SELECT *
FROM T_USER
ORDER BY BIRTHDAY DESC;

# (5-1)最小の生年月日のユーザ名を取得
SELECT BIRTHDAY AS "最小の生年月日",USER_NM AS "ユーザ名"
FROM T_USER
WHERE
   BIRTHDAY = (
        SELECT	MIN(BIRTHDAY)
        FROM	T_USER
   );

# (5-2)最大の生年月日のユーザ名を取得
SELECT BIRTHDAY AS "最大の生年月日",USER_NM AS "ユーザ名"
FROM T_USER
WHERE
   BIRTHDAY = (
        SELECT	MAX(BIRTHDAY)
        FROM	T_USER
   );

# (6)T_USERのデータを取得し、値がNULLの場合は変更する
SELECT USER_ID,USER_NM,PASSWORD,OFFICE_CD,IFNULL(BIRTHDAY,"2000/01/01") AS "BIRTHDAY",SENIORITY,DELET_FLG
FROM T_USER;


# (7)生年月日から年齢を取得する
SELECT*,TIMESTAMPDIFF(YEAR,BIRTHDAY, CURDATE()) AS "年齢"
FROM T_USER;