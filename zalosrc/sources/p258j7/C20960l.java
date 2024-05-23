package p258j7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;
import p291k7.InterfaceC21559z0;

/* renamed from: j7.l */
/* loaded from: classes3.dex */
public final class C20960l implements InterfaceC21559z0 {

    /* renamed from: a */
    private final InterfaceC21559z0 f102863a;

    public C20960l(InterfaceC21559z0 interfaceC21559z0) {
        this.f102863a = interfaceC21559z0;
    }

    @Override // p291k7.InterfaceC21559z0
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context m109500a = ((C20956j) this.f102863a).m109500a();
        try {
            Bundle bundle = m109500a.getPackageManager().getApplicationInfo(m109500a.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(m109500a.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
