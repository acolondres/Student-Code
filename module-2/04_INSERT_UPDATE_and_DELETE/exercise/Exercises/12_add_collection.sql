-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

 INSERT INTO collection(collection_name)
 VALUES ('Bill Murray Collection');


 UPDATE movie
 SET collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Bill Murray Collection')
 WHERE movie.movie_id in (SELECT movie.movie_id FROM movie JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
                                                            JOIN person ON movie_actor.actor_id = person.person_id
                                                            WHERE person_name= 'Bill Murray');