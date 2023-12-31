package com.example.transport2.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Класс описывает время движения по остановкам
 * routeStops - связь с таблицей остановки-маршруты
 * к какой сущности маршрут-остановка относится
 * dayOfWeek - день недели для этого времени прибытия
 * time - время прибытия транспорта на остановку
 */

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StopTime { //WeekStopTime
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    RouteStops routeStops;
    @Enumerated(EnumType.STRING)
    DayOfWeek dayOfWeek;
    LocalTime time; //вынести в отдельную таблицу ?
}
