package p463qw;

import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import com.zing.zalo.SensitiveData;
import me0.AbstractC23034c6;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;

/* renamed from: qw.b */
/* loaded from: classes.dex */
public class C25498b extends ContentObserver {

    /* renamed from: b */
    private static volatile ContentObserver f122133b;

    /* renamed from: a */
    protected Context f122134a;

    private C25498b(Context context, Handler handler) {
        super(handler);
        this.f122134a = context;
    }

    /* renamed from: b */
    public static void m132098b(Context context) {
        try {
            if (f122133b == null && AbstractC23034c6.m118165m(context, "android.permission.READ_CONTACTS") == 0) {
                synchronized (C25498b.class) {
                    try {
                        if (f122133b != null) {
                            return;
                        }
                        AbstractC23350e.m122772b("registerContentObserver PhoneContactObserver", new Object[0]);
                        f122133b = new C25498b(context, new Handler(Looper.getMainLooper()));
                        context.getContentResolver().registerContentObserver(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, true, f122133b);
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m132099c() {
        if (AbstractC23304d.f113330T0 && AbstractC23309i.m120864Dg()) {
            AbstractC23309i.m122335qw(true);
        } else {
            AbstractC0852x.m2338O(new SensitiveData("phonebook_auto_scan_by_observer", "phonebook_auto_scan"));
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11, Uri uri) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: qw.a
            @Override // java.lang.Runnable
            public final void run() {
                C25498b.m132099c();
            }
        });
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        onChange(z11, null);
    }
}
