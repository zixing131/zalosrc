package no;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: no.a */
/* loaded from: classes4.dex */
public class C23908a {

    /* renamed from: a */
    public Intent f115529a;

    /* renamed from: b */
    public ArrayList f115530b;

    /* renamed from: c */
    public boolean f115531c;

    /* renamed from: d */
    public String f115532d;

    private C23908a(Intent intent, ArrayList arrayList, boolean z11, String str) {
        this.f115529a = intent;
        this.f115530b = arrayList;
        this.f115531c = z11;
        this.f115532d = str;
    }

    /* renamed from: a */
    public static C23908a m125038a(Intent intent) {
        boolean z11;
        if (intent != null && intent.getExtras() != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            Bundle extras = intent.getExtras();
            String str = "";
            if (extras.getBoolean("EXTRA_BOOL_FEED_DELETED")) {
                str = extras.getString("EXTRA_STRING_FEED_ID", "");
                z11 = true;
            } else {
                arrayList = extras.getStringArrayList("deletedPhoto");
                z11 = false;
            }
            return new C23908a(intent, arrayList, z11, str);
        }
        return null;
    }
}
