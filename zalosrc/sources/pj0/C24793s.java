package pj0;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import mm0.AbstractC23352g;
import vg.AbstractC28110k3;

/* renamed from: pj0.s */
/* loaded from: classes7.dex */
public class C24793s {

    /* renamed from: a */
    private static final Object f119020a = new Object();

    /* renamed from: b */
    private static final ConcurrentHashMap f119021b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj0.s$a */
    /* loaded from: classes7.dex */
    public class a implements InterfaceC24778d {

        /* renamed from: a */
        final /* synthetic */ String f119022a;

        /* renamed from: b */
        final /* synthetic */ File f119023b;

        a(String str, File file) {
            this.f119022a = str;
            this.f119023b = file;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[ORIG_RETURN, RETURN] */
        @Override // pj0.InterfaceC24778d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo91792a(String str, File file) {
            LinkedList m128806d;
            synchronized (C24793s.f119020a) {
                try {
                    String str2 = this.f119022a;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = AbstractC23352g.m122785a(file);
                    }
                    BufferedWriter bufferedWriter = null;
                    try {
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(new File(this.f119023b + "_c")));
                            try {
                                bufferedWriter2.write(str2);
                                AbstractC28110k3.m141585a(bufferedWriter2);
                            } catch (Exception e11) {
                                e = e11;
                                bufferedWriter = bufferedWriter2;
                                e.printStackTrace();
                                AbstractC28110k3.m141585a(bufferedWriter);
                                m128806d = C24793s.this.m128806d(str);
                                if (m128806d == null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedWriter = bufferedWriter2;
                                AbstractC28110k3.m141585a(bufferedWriter);
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            m128806d = C24793s.this.m128806d(str);
            if (m128806d == null) {
                Iterator it = m128806d.iterator();
                while (it.hasNext()) {
                    InterfaceC24778d interfaceC24778d = (InterfaceC24778d) it.next();
                    if (interfaceC24778d != null) {
                        interfaceC24778d.mo91792a(str, file);
                    }
                }
            }
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: b */
        public void mo91793b(String str, String str2) {
            LinkedList m128806d = C24793s.this.m128806d(str);
            if (m128806d != null) {
                Iterator it = m128806d.iterator();
                while (it.hasNext()) {
                    InterfaceC24778d interfaceC24778d = (InterfaceC24778d) it.next();
                    if (interfaceC24778d != null) {
                        interfaceC24778d.mo91793b(str, str2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pj0.s$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        private static C24793s f119025a = new C24793s();
    }

    /* renamed from: c */
    public static C24793s m128805c() {
        return b.f119025a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public LinkedList m128806d(String str) {
        LinkedList linkedList;
        synchronized (f119020a) {
            linkedList = (LinkedList) f119021b.remove(str);
        }
        return linkedList;
    }

    /* renamed from: e */
    public InterfaceC24781g m128807e(InterfaceC24782h interfaceC24782h, String str, int i11, File file, InterfaceC24778d interfaceC24778d) {
        return m128808f(interfaceC24782h, str, "", i11, file, interfaceC24778d);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0014, B:21:0x005d, B:22:0x0060, B:25:0x0064, B:31:0x0070, B:32:0x0073, B:37:0x0074, B:39:0x007e, B:40:0x0089, B:42:0x008f, B:44:0x0091, B:45:0x0094), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[Catch: all -> 0x0062, DONT_GENERATE, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0014, B:21:0x005d, B:22:0x0060, B:25:0x0064, B:31:0x0070, B:32:0x0073, B:37:0x0074, B:39:0x007e, B:40:0x0089, B:42:0x008f, B:44:0x0091, B:45:0x0094), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0014, B:21:0x005d, B:22:0x0060, B:25:0x0064, B:31:0x0070, B:32:0x0073, B:37:0x0074, B:39:0x007e, B:40:0x0089, B:42:0x008f, B:44:0x0091, B:45:0x0094), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC24781g m128808f(InterfaceC24782h interfaceC24782h, String str, String str2, int i11, File file, InterfaceC24778d interfaceC24778d) {
        LinkedList linkedList;
        boolean z11;
        BufferedReader bufferedReader;
        synchronized (f119020a) {
            try {
                BufferedReader bufferedReader2 = null;
                if (file.exists() && file.length() > 0) {
                    File file2 = new File(file + "_c");
                    if (file2.length() == 32) {
                        try {
                            bufferedReader = new BufferedReader(new FileReader(file2));
                        } catch (Exception e11) {
                            e = e11;
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC28110k3.m141585a(bufferedReader2);
                            throw th;
                        }
                        try {
                            try {
                                String readLine = bufferedReader.readLine();
                                String m122785a = AbstractC23352g.m122785a(file);
                                if (!TextUtils.isEmpty(readLine) && TextUtils.equals(readLine, m122785a)) {
                                    if (interfaceC24778d != null) {
                                        interfaceC24778d.mo91792a(str, file);
                                    }
                                    AbstractC28110k3.m141585a(bufferedReader);
                                    return null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedReader2 = bufferedReader;
                                AbstractC28110k3.m141585a(bufferedReader2);
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            e.printStackTrace();
                            AbstractC28110k3.m141585a(bufferedReader);
                            ConcurrentHashMap concurrentHashMap = f119021b;
                            linkedList = (LinkedList) concurrentHashMap.get(str);
                            if (linkedList != null) {
                            }
                            if (!linkedList.contains(interfaceC24778d)) {
                            }
                        }
                        AbstractC28110k3.m141585a(bufferedReader);
                    }
                }
                ConcurrentHashMap concurrentHashMap2 = f119021b;
                linkedList = (LinkedList) concurrentHashMap2.get(str);
                if (linkedList != null) {
                    linkedList = new LinkedList();
                    concurrentHashMap2.put(str, linkedList);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!linkedList.contains(interfaceC24778d)) {
                    return null;
                }
                linkedList.push(interfaceC24778d);
                if (!z11) {
                    return null;
                }
                return interfaceC24782h.mo91782a(str, str2, i11, file, new a(str2, file));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
