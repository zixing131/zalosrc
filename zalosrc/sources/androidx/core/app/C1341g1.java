package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.g1 */
/* loaded from: classes2.dex */
public class C1341g1 {

    /* renamed from: a */
    CharSequence f5946a;

    /* renamed from: b */
    IconCompat f5947b;

    /* renamed from: c */
    String f5948c;

    /* renamed from: d */
    String f5949d;

    /* renamed from: e */
    boolean f5950e;

    /* renamed from: f */
    boolean f5951f;

    /* renamed from: androidx.core.app.g1$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static C1341g1 m6736a(Person person) {
            IconCompat iconCompat;
            b m6743f = new b().m6743f(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.m7148a(person.getIcon());
            } else {
                iconCompat = null;
            }
            return m6743f.m6740c(iconCompat).m6744g(person.getUri()).m6742e(person.getKey()).m6739b(person.isBot()).m6741d(person.isImportant()).m6738a();
        }

        /* renamed from: b */
        static Person m6737b(C1341g1 c1341g1) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(c1341g1.m6729c());
            if (c1341g1.m6727a() != null) {
                icon = c1341g1.m6727a().m7167s();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(c1341g1.m6730d()).setKey(c1341g1.m6728b()).setBot(c1341g1.m6731e()).setImportant(c1341g1.m6732f()).build();
        }
    }

    /* renamed from: androidx.core.app.g1$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        CharSequence f5952a;

        /* renamed from: b */
        IconCompat f5953b;

        /* renamed from: c */
        String f5954c;

        /* renamed from: d */
        String f5955d;

        /* renamed from: e */
        boolean f5956e;

        /* renamed from: f */
        boolean f5957f;

        /* renamed from: a */
        public C1341g1 m6738a() {
            return new C1341g1(this);
        }

        /* renamed from: b */
        public b m6739b(boolean z11) {
            this.f5956e = z11;
            return this;
        }

        /* renamed from: c */
        public b m6740c(IconCompat iconCompat) {
            this.f5953b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public b m6741d(boolean z11) {
            this.f5957f = z11;
            return this;
        }

        /* renamed from: e */
        public b m6742e(String str) {
            this.f5955d = str;
            return this;
        }

        /* renamed from: f */
        public b m6743f(CharSequence charSequence) {
            this.f5952a = charSequence;
            return this;
        }

        /* renamed from: g */
        public b m6744g(String str) {
            this.f5954c = str;
            return this;
        }
    }

    C1341g1(b bVar) {
        this.f5946a = bVar.f5952a;
        this.f5947b = bVar.f5953b;
        this.f5948c = bVar.f5954c;
        this.f5949d = bVar.f5955d;
        this.f5950e = bVar.f5956e;
        this.f5951f = bVar.f5957f;
    }

    /* renamed from: a */
    public IconCompat m6727a() {
        return this.f5947b;
    }

    /* renamed from: b */
    public String m6728b() {
        return this.f5949d;
    }

    /* renamed from: c */
    public CharSequence m6729c() {
        return this.f5946a;
    }

    /* renamed from: d */
    public String m6730d() {
        return this.f5948c;
    }

    /* renamed from: e */
    public boolean m6731e() {
        return this.f5950e;
    }

    /* renamed from: f */
    public boolean m6732f() {
        return this.f5951f;
    }

    /* renamed from: g */
    public String m6733g() {
        String str = this.f5948c;
        if (str != null) {
            return str;
        }
        if (this.f5946a != null) {
            return "name:" + ((Object) this.f5946a);
        }
        return "";
    }

    /* renamed from: h */
    public Person m6734h() {
        return a.m6737b(this);
    }

    /* renamed from: i */
    public Bundle m6735i() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f5946a);
        IconCompat iconCompat = this.f5947b;
        if (iconCompat != null) {
            bundle = iconCompat.m7166r();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f5948c);
        bundle2.putString("key", this.f5949d);
        bundle2.putBoolean("isBot", this.f5950e);
        bundle2.putBoolean("isImportant", this.f5951f);
        return bundle2;
    }
}
