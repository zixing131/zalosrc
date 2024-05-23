package i60;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: i60.s */
/* loaded from: classes5.dex */
public class C20353s {

    /* renamed from: a */
    public ArrayList f100359a;

    /* renamed from: b */
    public ArrayList f100360b;

    private C20353s(ArrayList arrayList, ArrayList arrayList2) {
        this.f100359a = arrayList;
        this.f100360b = arrayList2;
    }

    /* renamed from: a */
    public static C20353s m106098a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new C20353s(intent.getStringArrayListExtra("extra_selected_file"), intent.getParcelableArrayListExtra("extra_selected_file"));
    }
}
