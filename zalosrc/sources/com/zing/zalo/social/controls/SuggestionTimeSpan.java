package com.zing.zalo.social.controls;

import android.text.style.UnderlineSpan;

/* loaded from: classes5.dex */
public class SuggestionTimeSpan extends UnderlineSpan {

    /* renamed from: p */
    public int f54800p;

    /* renamed from: q */
    public int f54801q;

    /* renamed from: r */
    public int f54802r;

    /* renamed from: s */
    public int f54803s;

    /* renamed from: t */
    public String f54804t;

    /* renamed from: u */
    public long f54805u;

    /* renamed from: v */
    public boolean f54806v;

    public SuggestionTimeSpan(int i11, int i12, String str, long j11) {
        this.f54800p = i11;
        this.f54801q = i12;
        this.f54802r = i11;
        this.f54803s = i12;
        this.f54804t = str;
        this.f54805u = j11;
        this.f54806v = false;
    }

    public SuggestionTimeSpan(SuggestionTimeSpan suggestionTimeSpan) {
        this.f54800p = suggestionTimeSpan.f54800p;
        this.f54801q = suggestionTimeSpan.f54801q;
        this.f54802r = suggestionTimeSpan.f54802r;
        this.f54803s = suggestionTimeSpan.f54803s;
        this.f54804t = suggestionTimeSpan.f54804t;
        this.f54805u = suggestionTimeSpan.f54805u;
        this.f54806v = suggestionTimeSpan.f54806v;
    }
}
