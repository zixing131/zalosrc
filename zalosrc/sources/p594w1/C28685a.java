package p594w1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: w1.a */
/* loaded from: classes.dex */
public final class C28685a {

    /* renamed from: f */
    private static final Object f133146f = new Object();

    /* renamed from: g */
    private static C28685a f133147g;

    /* renamed from: a */
    private final Context f133148a;

    /* renamed from: b */
    private final HashMap f133149b = new HashMap();

    /* renamed from: c */
    private final HashMap f133150c = new HashMap();

    /* renamed from: d */
    private final ArrayList f133151d = new ArrayList();

    /* renamed from: e */
    private final Handler f133152e;

    /* renamed from: w1.a$a */
    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C28685a.this.m143694a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1.a$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        final Intent f133154a;

        /* renamed from: b */
        final ArrayList f133155b;

        b(Intent intent, ArrayList arrayList) {
            this.f133154a = intent;
            this.f133155b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final IntentFilter f133156a;

        /* renamed from: b */
        final BroadcastReceiver f133157b;

        /* renamed from: c */
        boolean f133158c;

        /* renamed from: d */
        boolean f133159d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f133156a = intentFilter;
            this.f133157b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f133157b);
            sb2.append(" filter=");
            sb2.append(this.f133156a);
            if (this.f133159d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private C28685a(Context context) {
        this.f133148a = context;
        this.f133152e = new a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C28685a m143693b(Context context) {
        C28685a c28685a;
        synchronized (f133146f) {
            try {
                if (f133147g == null) {
                    f133147g = new C28685a(context.getApplicationContext());
                }
                c28685a = f133147g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28685a;
    }

    /* renamed from: a */
    void m143694a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f133149b) {
                try {
                    size = this.f133151d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f133151d.toArray(bVarArr);
                    this.f133151d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = bVarArr[i11];
                int size2 = bVar.f133155b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    c cVar = (c) bVar.f133155b.get(i12);
                    if (!cVar.f133159d) {
                        cVar.f133157b.onReceive(this.f133148a, bVar.f133154a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m143695c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f133149b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f133149b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f133149b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList arrayList2 = (ArrayList) this.f133150c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f133150c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public boolean m143696d(Intent intent) {
        boolean z11;
        int i11;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        synchronized (this.f133149b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f133148a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Resolving type ");
                    sb2.append(resolveTypeIfNeeded);
                    sb2.append(" scheme ");
                    sb2.append(scheme);
                    sb2.append(" of intent ");
                    sb2.append(intent);
                }
                ArrayList arrayList3 = (ArrayList) this.f133150c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z11) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Action list: ");
                        sb3.append(arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        c cVar = (c) arrayList3.get(i12);
                        if (z11) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Matching against filter ");
                            sb4.append(cVar.f133156a);
                        }
                        if (cVar.f133158c) {
                            i11 = i12;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i11 = i12;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            int match = cVar.f133156a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z11) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("  Filter matched!  match=0x");
                                    sb5.append(Integer.toHexString(match));
                                }
                                if (arrayList == null) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList;
                                }
                                arrayList4.add(cVar);
                                cVar.f133158c = true;
                                i12 = i11 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            } else if (z11) {
                                if (match != -4) {
                                    if (match != -3) {
                                        if (match != -2) {
                                            if (match != -1) {
                                                str3 = "unknown reason";
                                            } else {
                                                str3 = ZinstantMetaConstant.IMPRESSION_META_TYPE;
                                            }
                                        } else {
                                            str3 = "data";
                                        }
                                    } else {
                                        str3 = "action";
                                    }
                                } else {
                                    str3 = "category";
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("  Filter did not match: ");
                                sb6.append(str3);
                            }
                        }
                        arrayList4 = arrayList;
                        i12 = i11 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            ((c) arrayList5.get(i13)).f133158c = false;
                        }
                        this.f133151d.add(new b(intent, arrayList5));
                        if (!this.f133152e.hasMessages(1)) {
                            this.f133152e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m143697e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f133149b) {
            try {
                ArrayList arrayList = (ArrayList) this.f133149b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f133159d = true;
                    for (int i11 = 0; i11 < cVar.f133156a.countActions(); i11++) {
                        String action = cVar.f133156a.getAction(i11);
                        ArrayList arrayList2 = (ArrayList) this.f133150c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f133157b == broadcastReceiver) {
                                    cVar2.f133159d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f133150c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
