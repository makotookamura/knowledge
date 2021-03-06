package org.support.project.knowledge.dao.gen;

import java.util.List;

import java.sql.Timestamp;


import org.support.project.knowledge.entity.WebhooksEntity;
import org.support.project.ormapping.dao.AbstractDao;
import org.support.project.ormapping.exception.ORMappingException;
import org.support.project.ormapping.common.SQLManager;
import org.support.project.ormapping.common.DBUserPool;
import org.support.project.ormapping.common.IDGen;
import org.support.project.ormapping.config.ORMappingParameter;
import org.support.project.ormapping.connection.ConnectionManager;
import org.support.project.common.util.PropertyUtil;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.aop.Aspect;

/**
 * Webhooks
 * this class is auto generate and not edit.
 * if modify dao method, you can edit WebhooksDao.
 */
@DI(instance = Instance.Singleton)
public class GenWebhooksDao extends AbstractDao {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static GenWebhooksDao get() {
        return Container.getComp(GenWebhooksDao.class);
    }

    /**
     * Select all data.
     * @return all data
     */
    public List<WebhooksEntity> physicalSelectAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_physical_select_all.sql");
        return executeQueryList(sql, WebhooksEntity.class);
    }
    /**
     * Select all data with pager.
     * @param limit limit
     * @param offset offset
     * @return all data on limit and offset
     */
    public List<WebhooksEntity> physicalSelectAllWithPager(int limit, int offset) { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_physical_select_all_with_pager.sql");
        return executeQueryList(sql, WebhooksEntity.class, limit, offset);
    }
    /**
     * Select data on key.
     * @param  webhookId webhookId
     * @return data
     */
    public WebhooksEntity physicalSelectOnKey(String webhookId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_physical_select_on_key.sql");
        return executeQuerySingle(sql, WebhooksEntity.class, webhookId);
    }
    /**
     * Select all data that not deleted.
     * @return all data
     */
    public List<WebhooksEntity> selectAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_select_all.sql");
        return executeQueryList(sql, WebhooksEntity.class);
    }
    /**
     * Select all data that not deleted with pager.
     * @param limit limit
     * @param offset offset
     * @return all data
     */
    public List<WebhooksEntity> selectAllWidthPager(int limit, int offset) { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_select_all_with_pager.sql");
        return executeQueryList(sql, WebhooksEntity.class, limit, offset);
    }
    /**
     * Select count that not deleted.
     * @return count
     */
    public Integer selectCountAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_select_count_all.sql");
        return executeQuerySingle(sql, Integer.class);
    }
    /**
     * Select data that not deleted on key.
     * @param  webhookId webhookId
     * @return data
     */
    public WebhooksEntity selectOnKey(String webhookId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_select_on_key.sql");
        return executeQuerySingle(sql, WebhooksEntity.class, webhookId);
    }
    /**
     * Count all data
     * @return count
     */
    public int physicalCountAll() {
        String sql = "SELECT COUNT(*) FROM WEBHOOKS";
        return executeQuerySingle(sql, Integer.class);
    }
    /**
     * Physical Insert.
     * it is not create key on database sequence.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity rawPhysicalInsert(WebhooksEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_raw_insert.sql");
        executeUpdate(sql, 
            entity.getWebhookId(), 
            entity.getStatus(), 
            entity.getHook(), 
            entity.getContent(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag());
        return entity;
    }
    /**
     * Physical Insert.
     * if key column have sequence, key value create by database.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity physicalInsert(WebhooksEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_insert.sql");
        executeUpdate(sql, 
            entity.getWebhookId(), 
            entity.getStatus(), 
            entity.getHook(), 
            entity.getContent(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag());
        return entity;
    }
    /**
     * Insert.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity insert(Integer user, WebhooksEntity entity) {
        entity.setInsertUser(user);
        entity.setInsertDatetime(new Timestamp(new java.util.Date().getTime()));
        entity.setUpdateUser(user);
        entity.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        entity.setDeleteFlag(0);
        return physicalInsert(entity);
    }
    /**
     * Insert.
     * saved user id is auto set.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity insert(WebhooksEntity entity) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer userId = (Integer) pool.getUser();
        return insert(userId, entity);
    }
    /**
     * Physical Update.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity physicalUpdate(WebhooksEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_update.sql");
        executeUpdate(sql, 
            entity.getStatus(), 
            entity.getHook(), 
            entity.getContent(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag(), 
            entity.getWebhookId());
        return entity;
    }
    /**
     * Update.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity update(Integer user, WebhooksEntity entity) {
        WebhooksEntity db = selectOnKey(entity.getWebhookId());
        entity.setInsertUser(db.getInsertUser());
        entity.setInsertDatetime(db.getInsertDatetime());
        entity.setDeleteFlag(db.getDeleteFlag());
        entity.setUpdateUser(user);
        entity.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        return physicalUpdate(entity);
    }
    /**
     * Update.
     * saved user id is auto set.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity update(WebhooksEntity entity) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer userId = (Integer) pool.getUser();
        return update(userId, entity);
    }
    /**
     * Save. 
     * if same key data is exists, the data is update. otherwise the data is insert.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity save(Integer user, WebhooksEntity entity) {
        WebhooksEntity db = selectOnKey(entity.getWebhookId());
        if (db == null) {
            return insert(user, entity);
        } else {
            return update(user, entity);
        }
    }
    /**
     * Save. 
     * if same key data is exists, the data is update. otherwise the data is insert.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public WebhooksEntity save(WebhooksEntity entity) {
        WebhooksEntity db = selectOnKey(entity.getWebhookId());
        if (db == null) {
            return insert(entity);
        } else {
            return update(entity);
        }
    }
    /**
     * Physical Delete.
     * @param  webhookId webhookId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void physicalDelete(String webhookId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/WebhooksDao/WebhooksDao_delete.sql");
        executeUpdate(sql, webhookId);
    }
    /**
     * Physical Delete.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void physicalDelete(WebhooksEntity entity) {
        physicalDelete(entity.getWebhookId());

    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param user saved userid
     * @param  webhookId webhookId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Integer user, String webhookId) {
        WebhooksEntity db = selectOnKey(webhookId);
        db.setDeleteFlag(1);
        db.setUpdateUser(user);
        db.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        physicalUpdate(db);
    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * @param  webhookId webhookId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(String webhookId) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer user = (Integer) pool.getUser();
        delete(user, webhookId);
    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Integer user, WebhooksEntity entity) {
        delete(user, entity.getWebhookId());

    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(WebhooksEntity entity) {
        delete(entity.getWebhookId());

    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * set saved user id.
     * @param user saved userid
     * @param  webhookId webhookId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Integer user, String webhookId) {
        WebhooksEntity db = physicalSelectOnKey(webhookId);
        db.setDeleteFlag(0);
        db.setUpdateUser(user);
        db.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        physicalUpdate(db);
    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * @param  webhookId webhookId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(String webhookId) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer user = (Integer) pool.getUser();
        activation(user, webhookId);
    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Integer user, WebhooksEntity entity) {
        activation(user, entity.getWebhookId());

    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(WebhooksEntity entity) {
        activation(entity.getWebhookId());

    }

}
