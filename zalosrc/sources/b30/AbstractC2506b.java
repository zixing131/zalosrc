package b30;

import android.content.Intent;
import android.os.Bundle;
import ho0.AbstractC20110a;

/* renamed from: b30.b */
/* loaded from: classes.dex */
public abstract class AbstractC2506b {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12587b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            AbstractC20110a.m104535d("Dumping intent start", new Object[0]);
            AbstractC20110a.m104535d("action: " + intent.getAction(), new Object[0]);
            AbstractC20110a.m104535d("dataString: " + intent.getDataString(), new Object[0]);
            AbstractC20110a.m104535d("component: " + intent.getComponent(), new Object[0]);
            for (String str : extras.keySet()) {
                AbstractC20110a.m104535d('[' + str + '=' + extras.get(str) + ']', new Object[0]);
            }
            AbstractC20110a.m104535d("Dumping intent finish", new Object[0]);
        }
    }
}
