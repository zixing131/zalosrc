package p309l;

import android.os.AsyncTask;
import p283k.AbstractC21420a;

/* renamed from: l.e */
/* loaded from: classes2.dex */
public final class C21977e {

    /* renamed from: a */
    private static C21977e f108189a;

    /* renamed from: l.e$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onCompleted(C21976d c21976d);

        void onError(int i11);
    }

    /* renamed from: l.e$b */
    /* loaded from: classes2.dex */
    private class b extends AsyncTask {

        /* renamed from: a */
        private String f108190a;

        /* renamed from: b */
        private a f108191b;

        /* renamed from: c */
        private String f108192c;

        /* renamed from: d */
        private String f108193d;

        /* renamed from: e */
        private String f108194e;

        /* renamed from: f */
        private C21976d f108195f = null;

        /* renamed from: g */
        private int f108196g = 0;

        public b(C21977e c21977e, String str, a aVar, String str2, String str3, String str4) {
            this.f108190a = str;
            this.f108191b = aVar;
            this.f108194e = str2;
            this.f108192c = str4;
            this.f108193d = str3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            try {
                C21978f c21978f = new C21978f(this.f108192c, this.f108193d, this.f108194e);
                this.f108195f = c21978f.m114786d(this.f108190a);
                this.f108196g = c21978f.m114784a();
                return null;
            } catch (Exception e11) {
                AbstractC21420a.m110922b("DAASTParser", "doInBackground", e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            super.onPostExecute(r32);
            try {
                a aVar = this.f108191b;
                if (aVar != null) {
                    int i11 = this.f108196g;
                    if (i11 != 0) {
                        aVar.onError(i11);
                    } else {
                        aVar.onCompleted(this.f108195f);
                    }
                }
            } catch (Exception e11) {
                AbstractC21420a.m110922b("DAASTParser", "onPostExecute", e11);
            }
        }
    }

    private C21977e() {
    }

    /* renamed from: b */
    public static C21977e m114777b() {
        if (f108189a == null) {
            f108189a = new C21977e();
        }
        return f108189a;
    }

    /* renamed from: a */
    public C21976d m114778a(String str, String str2, String str3, String str4) {
        try {
            return new C21978f(str2, str3, str4).m114786d(str);
        } catch (Exception e11) {
            AbstractC21420a.m110922b("DAASTParser", "parseSync", e11);
            return null;
        }
    }

    /* renamed from: c */
    public void m114779c(String str, String str2, String str3, String str4, a aVar) {
        try {
            new b(this, str, aVar, str2, str3, str4).execute(new Void[0]);
        } catch (Exception e11) {
            AbstractC21420a.m110922b("DAASTParser", "parseASync", e11);
        }
    }
}
