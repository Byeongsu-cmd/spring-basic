package org.example.springbasic.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbasic.dto.MemberRequest;
import org.example.springbasic.dto.MemberResponse;
import org.example.springbasic.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberResponse> createMember(
            @RequestBody MemberRequest memberRequest
    ) {
        return ResponseEntity.ok(memberService.save(memberRequest));
    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberResponse>> getMembers() {
        return ResponseEntity.ok(memberService.findMembers());
    }

    @GetMapping("/members/{memberId}")
    public ResponseEntity<MemberResponse> getMember(
            @PathVariable Long memberId
    ) {
        return ResponseEntity.ok(memberService.findMember(memberId));
    }

    @PutMapping("/members/{memberId}")
    public ResponseEntity<MemberResponse> updateMember(
            @PathVariable Long memberId,
            @RequestBody MemberRequest memberRequest
    ) {
        return ResponseEntity.ok(memberService.update(memberId, memberRequest));
    }

    @DeleteMapping("/members/{memberId}")
    public void deleteMember(
            @PathVariable Long memberId
    ) {
        memberService.deleteMember(memberId);
    }
}