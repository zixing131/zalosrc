package fh0;

import android.app.Application;
import gh0.C19447a;
import hh0.C20063a;
import jh0.AbstractC21254a;
import kh0.C21726b;
import p327lm.C22522b;
import p327lm.C22523c;

/* renamed from: fh0.d */
/* loaded from: classes.dex */
public abstract class AbstractC18939d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh0.d$a */
    /* loaded from: classes.dex */
    public class a implements C22523c.a {

        /* renamed from: a */
        final /* synthetic */ Application f94468a;

        a(Application application) {
            this.f94468a = application;
        }

        @Override // p327lm.C22523c.a
        /* renamed from: a */
        public void mo99243a(String str) {
            C19447a.m101720d().m101729j(this.f94468a, str);
        }
    }

    /* renamed from: a */
    public static void m99240a(boolean z11) {
        AbstractC21254a.f103559a = Boolean.valueOf(z11);
    }

    /* renamed from: b */
    public static void m99241b(Application application) {
        C18938c.m99238c(application);
        m99242c(application);
    }

    /* renamed from: c */
    private static void m99242c(Application application) {
        C21726b.m112130b().m112135e(application);
        String m104233b = C20063a.m104233b(application);
        C22522b c22522b = new C22522b(application);
        C22523c m116498g = C22523c.m116498g();
        m116498g.m116509l(application, c22522b, m104233b);
        m116498g.m116504e(new a(application));
    }
}
