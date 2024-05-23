package p231i7;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.splitinstall.internal.AbstractC6516c;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* renamed from: i7.c */
/* loaded from: classes.dex */
public final class C20359c {

    /* renamed from: a */
    private final C20363g f100373a;

    public C20359c(C20363g c20363g) {
        this.f100373a = c20363g;
    }

    /* renamed from: b */
    public static final int m106120b(AssetManager assetManager, File file) {
        int intValue = ((Integer) AbstractC6516c.m33396d(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("addAssetPath completed with ");
        sb2.append(intValue);
        return intValue;
    }

    /* renamed from: a */
    public final synchronized void m106121a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m106120b(assets, (File) it.next());
        }
    }
}
