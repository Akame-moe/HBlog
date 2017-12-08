create table `article`(
	`id` int primary key not null auto_increment,
	`title` varchar(100) default 'None',
	`content` longtext ,
	`postdate` datetime default null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into article(title,content,postdate) values
  ('第一篇文章','这是第一篇文章的内容','2017-10-11 15:12:20'),
  ('第二篇文章','这是第一篇文章的内容','2017-03-11 14:32:20'),
  ('第三篇文章','这是第一篇文章的内容','2017-11-11 16:12:20'),
  ('第四篇文章','这是第一篇文章的内容','2017-11-23 15:12:20');

create table `tag`(
	`id` int primary key not null auto_increment,
	`name` varchar(20) default '其他'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into tag(name) values
  ('Java'),
  ('Nodejs'),
  ('其他'),
  ('Python'),
  ('安全');


create table `article_tag`(
	`id` int primary key not null auto_increment,
	`article_id` int not null,
	`tag_id` int not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into article_tag(article_id,tag_id) values
  (1,2),
  (1,3),
  (2,1),
  (2,4),
  (3,3),
  (4,4),
  (4,5);