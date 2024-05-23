package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p521t9.AbstractC26604e;
import p521t9.AbstractC26607h;
import p521t9.C26602c;
import p673y8.C30818f;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m33453e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m33454f(Context context) {
        int i11;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i11 = applicationInfo.minSdkVersion;
            return String.valueOf(i11);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m33455g(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i11 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i11 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m33456h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m33457i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    private static String m33457i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C26602c.m136558c());
        arrayList.add(C30818f.m149898g());
        arrayList.add(AbstractC26607h.m136567b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC26607h.m136567b("fire-core", "20.3.2"));
        arrayList.add(AbstractC26607h.m136567b("device-name", m33457i(Build.PRODUCT)));
        arrayList.add(AbstractC26607h.m136567b("device-model", m33457i(Build.DEVICE)));
        arrayList.add(AbstractC26607h.m136567b("device-brand", m33457i(Build.BRAND)));
        arrayList.add(AbstractC26607h.m136568c("android-target-sdk", new AbstractC26607h.a() { // from class: com.google.firebase.g
            @Override // p521t9.AbstractC26607h.a
            /* renamed from: a */
            public final String mo33624a(Object obj) {
                String m33453e;
                m33453e = FirebaseCommonRegistrar.m33453e((Context) obj);
                return m33453e;
            }
        }));
        arrayList.add(AbstractC26607h.m136568c("android-min-sdk", new AbstractC26607h.a() { // from class: com.google.firebase.h
            @Override // p521t9.AbstractC26607h.a
            /* renamed from: a */
            public final String mo33624a(Object obj) {
                String m33454f;
                m33454f = FirebaseCommonRegistrar.m33454f((Context) obj);
                return m33454f;
            }
        }));
        arrayList.add(AbstractC26607h.m136568c("android-platform", new AbstractC26607h.a() { // from class: com.google.firebase.i
            @Override // p521t9.AbstractC26607h.a
            /* renamed from: a */
            public final String mo33624a(Object obj) {
                String m33455g;
                m33455g = FirebaseCommonRegistrar.m33455g((Context) obj);
                return m33455g;
            }
        }));
        arrayList.add(AbstractC26607h.m136568c("android-installer", new AbstractC26607h.a() { // from class: com.google.firebase.j
            @Override // p521t9.AbstractC26607h.a
            /* renamed from: a */
            public final String mo33624a(Object obj) {
                String m33456h;
                m33456h = FirebaseCommonRegistrar.m33456h((Context) obj);
                return m33456h;
            }
        }));
        String m136564a = AbstractC26604e.m136564a();
        if (m136564a != null) {
            arrayList.add(AbstractC26607h.m136567b("kotlin", m136564a));
        }
        return arrayList;
    }
}
