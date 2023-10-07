package br.com.fabiokusaba.todolist.repository;

import br.com.fabiokusaba.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
