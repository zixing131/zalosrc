package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class lx0 {

    /* renamed from: a */
    private final int f24274a;

    /* renamed from: b */
    private final int f24275b;

    /* renamed from: c */
    private final int f24276c;

    /* renamed from: d */
    private final int f24277d;

    /* renamed from: e */
    private int f24278e;

    /* renamed from: f */
    private int f24279f;

    /* renamed from: g */
    private boolean f24280g;

    /* renamed from: h */
    private final c83 f24281h;

    /* renamed from: i */
    private final c83 f24282i;

    /* renamed from: j */
    private final int f24283j;

    /* renamed from: k */
    private final int f24284k;

    /* renamed from: l */
    private final c83 f24285l;

    /* renamed from: m */
    private c83 f24286m;

    /* renamed from: n */
    private int f24287n;

    /* renamed from: o */
    private final HashMap f24288o;

    /* renamed from: p */
    private final HashSet f24289p;

    public lx0() {
        this.f24274a = Integer.MAX_VALUE;
        this.f24275b = Integer.MAX_VALUE;
        this.f24276c = Integer.MAX_VALUE;
        this.f24277d = Integer.MAX_VALUE;
        this.f24278e = Integer.MAX_VALUE;
        this.f24279f = Integer.MAX_VALUE;
        this.f24280g = true;
        this.f24281h = c83.m20832w();
        this.f24282i = c83.m20832w();
        this.f24283j = Integer.MAX_VALUE;
        this.f24284k = Integer.MAX_VALUE;
        this.f24285l = c83.m20832w();
        this.f24286m = c83.m20832w();
        this.f24287n = 0;
        this.f24288o = new HashMap();
        this.f24289p = new HashSet();
    }

    /* renamed from: d */
    public final lx0 m24410d(Context context) {
        CaptioningManager captioningManager;
        if ((g92.f20474a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f24287n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f24286m = c83.m20833x(g92.m22356n(locale));
            }
        }
        return this;
    }

    /* renamed from: e */
    public lx0 mo24411e(int i11, int i12, boolean z11) {
        this.f24278e = i11;
        this.f24279f = i12;
        this.f24280g = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public lx0(my0 my0Var) {
        this.f24274a = Integer.MAX_VALUE;
        this.f24275b = Integer.MAX_VALUE;
        this.f24276c = Integer.MAX_VALUE;
        this.f24277d = Integer.MAX_VALUE;
        this.f24278e = my0Var.f24918i;
        this.f24279f = my0Var.f24919j;
        this.f24280g = my0Var.f24920k;
        this.f24281h = my0Var.f24921l;
        this.f24282i = my0Var.f24923n;
        this.f24283j = Integer.MAX_VALUE;
        this.f24284k = Integer.MAX_VALUE;
        this.f24285l = my0Var.f24927r;
        this.f24286m = my0Var.f24928s;
        this.f24287n = my0Var.f24929t;
        this.f24289p = new HashSet(my0Var.f24935z);
        this.f24288o = new HashMap(my0Var.f24934y);
    }
}
