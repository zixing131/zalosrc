package com.zing.zalo.dialog.datetimepicker;

import com.zing.zalo.dialog.DatePickerDialog;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import java.util.Date;

/* renamed from: com.zing.zalo.dialog.datetimepicker.a */
/* loaded from: classes3.dex */
public class C8003a {

    /* renamed from: a */
    C17487o0 f43790a;

    /* renamed from: b */
    b f43791b;

    /* renamed from: c */
    Date f43792c;

    /* renamed from: d */
    Date f43793d;

    /* renamed from: e */
    Date f43794e;

    /* renamed from: f */
    boolean f43795f;

    /* renamed from: g */
    boolean f43796g;

    /* renamed from: h */
    boolean f43797h;

    /* renamed from: i */
    boolean f43798i = true;

    /* renamed from: j */
    boolean f43799j = true;

    /* renamed from: com.zing.zalo.dialog.datetimepicker.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final C17487o0 f43800a;

        /* renamed from: b */
        private b f43801b;

        /* renamed from: c */
        private Date f43802c;

        /* renamed from: d */
        private Date f43803d;

        /* renamed from: e */
        private Date f43804e;

        /* renamed from: f */
        private boolean f43805f;

        /* renamed from: g */
        private boolean f43806g;

        /* renamed from: h */
        private boolean f43807h;

        /* renamed from: i */
        private boolean f43808i = true;

        /* renamed from: j */
        private boolean f43809j = true;

        public a(C17487o0 c17487o0) {
            this.f43800a = c17487o0;
        }

        /* renamed from: a */
        public C8003a m43137a() {
            C8003a c8003a = new C8003a(this.f43800a);
            c8003a.m43132f(this.f43801b);
            c8003a.m43127a(this.f43802c);
            c8003a.m43134h(this.f43803d);
            c8003a.m43133g(this.f43804e);
            c8003a.m43129c(this.f43805f);
            c8003a.m43128b(this.f43806g);
            c8003a.m43130d(this.f43807h);
            c8003a.m43131e(this.f43808i);
            c8003a.m43135i(this.f43809j);
            return c8003a;
        }

        /* renamed from: b */
        public a m43138b(Date date) {
            this.f43802c = date;
            return this;
        }

        /* renamed from: c */
        public a m43139c(boolean z11) {
            this.f43805f = true;
            this.f43806g = z11;
            return this;
        }

        /* renamed from: d */
        public a m43140d(boolean z11) {
            this.f43807h = z11;
            return this;
        }

        /* renamed from: e */
        public a m43141e(boolean z11) {
            this.f43808i = z11;
            return this;
        }

        /* renamed from: f */
        public a m43142f(b bVar) {
            this.f43801b = bVar;
            return this;
        }

        /* renamed from: g */
        public a m43143g(Date date) {
            this.f43804e = date;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setMaxDate: ");
            sb2.append(date.toString());
            return this;
        }

        /* renamed from: h */
        public a m43144h(Date date) {
            this.f43803d = date;
            return this;
        }

        /* renamed from: i */
        public a m43145i(boolean z11) {
            this.f43809j = z11;
            return this;
        }
    }

    /* renamed from: com.zing.zalo.dialog.datetimepicker.a$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo43146a(Date date, boolean z11);

        /* renamed from: b */
        void mo43147b();
    }

    public C8003a(C17487o0 c17487o0) {
        this.f43790a = c17487o0;
    }

    /* renamed from: a */
    public void m43127a(Date date) {
        this.f43792c = date;
    }

    /* renamed from: b */
    public void m43128b(boolean z11) {
        m43129c(true);
        this.f43796g = z11;
    }

    /* renamed from: c */
    void m43129c(boolean z11) {
        this.f43795f = z11;
    }

    /* renamed from: d */
    public void m43130d(boolean z11) {
        this.f43797h = z11;
    }

    /* renamed from: e */
    public void m43131e(boolean z11) {
        this.f43798i = z11;
    }

    /* renamed from: f */
    public void m43132f(b bVar) {
        this.f43791b = bVar;
    }

    /* renamed from: g */
    public void m43133g(Date date) {
        this.f43794e = date;
    }

    /* renamed from: h */
    public void m43134h(Date date) {
        this.f43793d = date;
    }

    /* renamed from: i */
    public void m43135i(boolean z11) {
        this.f43799j = z11;
    }

    /* renamed from: j */
    public void m43136j() {
        DialogView m42863hL;
        String str;
        if (this.f43792c == null) {
            m43127a(new Date());
        }
        if (this.f43798i) {
            m42863hL = DateTimeDialogView.m43113bL(this.f43791b, this.f43792c, this.f43793d, this.f43794e, this.f43795f, this.f43796g, this.f43797h, this.f43799j);
            str = "tagSlideDateTimeDialogFragment";
        } else {
            m42863hL = DatePickerDialog.m42863hL(this.f43791b, this.f43792c, this.f43793d, this.f43794e, this.f43797h, this.f43799j);
            str = "TAG_SLIDE_DATE_PICKER_DIALOG_FRAGMENT";
        }
        if (m42863hL.m92687sJ()) {
            m42863hL.dismiss();
        }
        m42863hL.m92602UK(this.f43790a, str);
    }
}
