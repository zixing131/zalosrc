package p350n;

import android.content.Context;
import android.os.AsyncTask;
import p283k.AbstractC21420a;

/* renamed from: n.e */
/* loaded from: classes2.dex */
public final class C23499e {

    /* renamed from: a */
    private static C23499e f114093a;

    /* renamed from: n.e$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onCompleted(C23498d c23498d);

        void onError(int i11);
    }

    /* renamed from: n.e$b */
    /* loaded from: classes2.dex */
    private class b extends AsyncTask {

        /* renamed from: a */
        private Context f114094a;

        /* renamed from: b */
        private String f114095b;

        /* renamed from: c */
        private a f114096c;

        /* renamed from: d */
        private String f114097d;

        /* renamed from: e */
        private String f114098e;

        /* renamed from: f */
        private String f114099f;

        /* renamed from: g */
        private C23498d f114100g = null;

        /* renamed from: h */
        private int f114101h = 0;

        public b(C23499e c23499e, Context context, String str, String str2, String str3, String str4, a aVar) {
            this.f114094a = context;
            this.f114095b = str;
            this.f114096c = aVar;
            this.f114099f = str2;
            this.f114097d = str4;
            this.f114098e = str3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            try {
                C23500f c23500f = new C23500f(this.f114094a, this.f114097d, this.f114098e, this.f114099f);
                this.f114100g = c23500f.m123369d(this.f114095b);
                this.f114101h = c23500f.m123367a();
                return null;
            } catch (Exception e11) {
                AbstractC21420a.m110922b("VASTParser", "doInBackground", e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            super.onPostExecute(r32);
            try {
                a aVar = this.f114096c;
                if (aVar != null) {
                    if (this.f114101h != 0) {
                        AbstractC21420a.m110923c("VASTParser", "parseSync with code " + this.f114101h);
                        this.f114096c.onError(this.f114101h);
                    } else {
                        aVar.onCompleted(this.f114100g);
                    }
                }
            } catch (Exception e11) {
                AbstractC21420a.m110922b("VASTParser", "onPostExecute", e11);
            }
        }
    }

    private C23499e() {
    }

    /* renamed from: b */
    public static C23499e m123360b() {
        if (f114093a == null) {
            f114093a = new C23499e();
        }
        return f114093a;
    }

    /* renamed from: a */
    public C23498d m123361a(Context context, String str, String str2, String str3, String str4) {
        try {
            return new C23500f(context, str2, str3, str4).m123369d(str);
        } catch (Exception e11) {
            AbstractC21420a.m110922b("VASTParser", "parseSync", e11);
            return null;
        }
    }

    /* renamed from: c */
    public void m123362c(Context context, String str, String str2, String str3, String str4, a aVar) {
        try {
            new b(this, context, str, str2, str3, str4, aVar).execute(new Void[0]);
        } catch (Exception e11) {
            AbstractC21420a.m110922b("VASTParser", "parseASync", e11);
        }
    }
}
