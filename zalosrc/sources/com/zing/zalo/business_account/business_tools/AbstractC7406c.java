package com.zing.zalo.business_account.business_tools;

import android.graphics.drawable.Drawable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.business_account.business_tools.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7406c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f40256a;

    /* renamed from: com.zing.zalo.business_account.business_tools.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7406c {

        /* renamed from: b */
        public static final b f40257b = new b();

        private b() {
            super(0, null);
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7406c {

        /* renamed from: b */
        private final String f40258b;

        /* renamed from: c */
        private final String f40259c;

        /* renamed from: d */
        private final String f40260d;

        /* renamed from: e */
        private final String f40261e;

        /* renamed from: f */
        private final CharSequence f40262f;

        /* renamed from: g */
        private final String f40263g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, CharSequence charSequence, String str5) {
            super(1, null);
            AbstractC19074t.m100208f(str, "avatarUrl");
            AbstractC19074t.m100208f(str2, "displayName");
            AbstractC19074t.m100208f(str3, "label");
            AbstractC19074t.m100208f(str4, "profileUrl");
            AbstractC19074t.m100208f(charSequence, "learnMoreText");
            AbstractC19074t.m100208f(str5, "learnMoreUrl");
            this.f40258b = str;
            this.f40259c = str2;
            this.f40260d = str3;
            this.f40261e = str4;
            this.f40262f = charSequence;
            this.f40263g = str5;
        }

        /* renamed from: b */
        public final String m37611b() {
            return this.f40259c;
        }

        /* renamed from: c */
        public final String m37612c() {
            return this.f40260d;
        }

        /* renamed from: d */
        public final CharSequence m37613d() {
            return this.f40262f;
        }

        /* renamed from: e */
        public final String m37614e() {
            return this.f40263g;
        }

        /* renamed from: f */
        public final String m37615f() {
            return this.f40261e;
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC7406c {

        /* renamed from: b */
        private final Drawable f40264b;

        /* renamed from: c */
        private final CharSequence f40265c;

        /* renamed from: d */
        private final CharSequence f40266d;

        /* renamed from: e */
        private final String f40267e;

        /* renamed from: f */
        private boolean f40268f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, String str) {
            super(i11, null);
            AbstractC19074t.m100208f(charSequence, "title");
            AbstractC19074t.m100208f(str, "trackingID");
            this.f40264b = drawable;
            this.f40265c = charSequence;
            this.f40266d = charSequence2;
            this.f40267e = str;
        }

        /* renamed from: b */
        public final Drawable m37616b() {
            return this.f40264b;
        }

        /* renamed from: c */
        public final CharSequence m37617c() {
            return this.f40266d;
        }

        /* renamed from: d */
        public final CharSequence m37618d() {
            return this.f40265c;
        }

        /* renamed from: e */
        public final String m37619e() {
            return this.f40267e;
        }

        /* renamed from: f */
        public final boolean m37620f() {
            return this.f40268f;
        }
    }

    public /* synthetic */ AbstractC7406c(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m37610a() {
        return this.f40256a;
    }

    private AbstractC7406c(int i11) {
        this.f40256a = i11;
    }
}
