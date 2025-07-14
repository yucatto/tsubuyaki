package jp.kobe_u.cs.daikibo.tsubuyaki.controller;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class KensakuForm {
    @NotBlank
    String word; //検索ワード
}