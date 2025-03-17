package com.habittracker.backend.entity;

import java.time.LocalDateTime;

import com.habittracker.backend.entity.enums.SuggestionStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AISuggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String suggestedHabitName;
    private String reason; // Why the suggestion was made

    @Enumerated(EnumType.STRING)
    private SuggestionStatus status; // PENDING, ACCEPTED, REJECTED

    private LocalDateTime suggestedAt;
}