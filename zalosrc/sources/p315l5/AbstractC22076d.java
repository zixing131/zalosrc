package p315l5;

import android.os.Looper;

/* renamed from: l5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC22076d {

    /* renamed from: a */
    private static volatile ClassLoader f108682a;

    /* renamed from: b */
    private static volatile Thread f108683b;

    /* renamed from: a */
    public static synchronized ClassLoader m115216a() {
        ClassLoader classLoader;
        synchronized (AbstractC22076d.class) {
            try {
                if (f108682a == null) {
                    f108682a = m115217b();
                }
                classLoader = f108682a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return classLoader;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m115217b() {
        synchronized (AbstractC22076d.class) {
            ClassLoader classLoader = null;
            if (f108683b == null) {
                f108683b = m115218c();
                if (f108683b == null) {
                    return null;
                }
            }
            synchronized (f108683b) {
                try {
                    classLoader = f108683b.getContextClassLoader();
                } catch (SecurityException e11) {
                    String message = e11.getMessage();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to get thread context classloader ");
                    sb2.append(message);
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    private static synchronized Thread m115218c() {
        SecurityException e11;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (AbstractC22076d.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    try {
                        int activeGroupCount = threadGroup2.activeGroupCount();
                        ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                        threadGroup2.enumerate(threadGroupArr);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            if (i12 < activeGroupCount) {
                                threadGroup = threadGroupArr[i12];
                                if ("dynamiteLoader".equals(threadGroup.getName())) {
                                    break;
                                }
                                i12++;
                            } else {
                                threadGroup = null;
                                break;
                            }
                        }
                        if (threadGroup == null) {
                            threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                        }
                        int activeCount = threadGroup.activeCount();
                        Thread[] threadArr = new Thread[activeCount];
                        threadGroup.enumerate(threadArr);
                        while (true) {
                            if (i11 < activeCount) {
                                thread2 = threadArr[i11];
                                if ("GmsDynamite".equals(thread2.getName())) {
                                    break;
                                }
                                i11++;
                            } else {
                                thread2 = null;
                                break;
                            }
                        }
                    } catch (SecurityException e12) {
                        e11 = e12;
                        thread = null;
                    }
                    if (thread2 == null) {
                        try {
                            thread = new C22075c(threadGroup, "GmsDynamite");
                        } catch (SecurityException e13) {
                            e11 = e13;
                            thread = thread2;
                        }
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e14) {
                            e11 = e14;
                            String message = e11.getMessage();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to enumerate thread/threadgroup ");
                            sb2.append(message);
                            thread2 = thread;
                            return thread2;
                        }
                        thread2 = thread;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return thread2;
        }
    }
}
