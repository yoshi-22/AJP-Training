#テーブル（M_OFFICE）の作成
CREATE TABLE M_OFFICE (
	OFFICE_CD varchar(4) not null,
	SALES_OFFICE_NM varchar (30) not null,
	DELET_FLG varchar (1) not null default "0"
);


#テーブル（M_OFFICE）にデータの登録を行う
INSERT INTO M_OFFICE
	(OFFICE_CD,SALES_OFFICE_NM,DELET_FLG)

VALUES 
	("1001","大阪営業所",default),
	("2001","福岡営業所",default),
	("3001","広島営業所",default),
	("4001","京都営業所",default),
	("5001","和歌山営業所",default),
	("6001","静岡営業所",default),
	("7001","福井営業所",default),
	("8001","東京営業所",default),
	("901","沖縄支部",default),
	("901","沖縄支部","1"),
	("901","沖縄支部","1");