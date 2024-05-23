package p232i8;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;
import p153f8.C18820e;

/* renamed from: i8.a */
/* loaded from: classes.dex */
public class C20381a {

    /* renamed from: a */
    public final String f100414a;

    /* renamed from: b */
    public final String f100415b;

    /* renamed from: c */
    public final List f100416c;

    /* renamed from: d */
    public final String f100417d;

    /* renamed from: e */
    public final String f100418e;

    /* renamed from: f */
    public final String f100419f;

    /* renamed from: g */
    public final String f100420g;

    /* renamed from: h */
    public final C18820e f100421h;

    public C20381a(String str, String str2, List list, String str3, String str4, String str5, String str6, C18820e c18820e) {
        this.f100414a = str;
        this.f100415b = str2;
        this.f100416c = list;
        this.f100417d = str3;
        this.f100418e = str4;
        this.f100419f = str5;
        this.f100420g = str6;
        this.f100421h = c18820e;
    }

    /* renamed from: a */
    public static C20381a m106168a(Context context, C20422w c20422w, String str, String str2, List list, C18820e c18820e) {
        String packageName = context.getPackageName();
        String m106429g = c20422w.m106429g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C20381a(str, str2, list, m106429g, packageName, num, str3, c18820e);
    }
}
